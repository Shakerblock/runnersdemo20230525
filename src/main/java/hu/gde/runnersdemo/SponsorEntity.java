package hu.gde.runnersdemo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Sponsor")
public class SponsorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(nullable = false)
    private RunnerEntity runner;

    @Column(name = "sponsor_name", nullable = false)
    private String sponsorName;

    public long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public RunnerEntity getRunner() {
        return runner;
    }
    public void setRunner(RunnerEntity runner) {
        this.runner = runner;
    }

    public String getsponsorName() {
        return sponsorName;
    }
    public void setSponsorName(String sponsorName) {this.sponsorName = sponsorName;}


}
