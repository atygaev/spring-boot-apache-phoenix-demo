package phoenix.demo.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "samples")
public class Sample {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ldt")
    private LocalDateTime ldt;

    @Column(name = "sdt")
    private Date sdt;
}