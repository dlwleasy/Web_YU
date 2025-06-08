package jobstack.jobstack.Question;

import java.time.LocalDateTime;
import jakarta.persistence.CascadeType;
import jakarta.persistence.*;
import jobstack.jobstack.Answer.Answer;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length =200)
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime createDate;
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
//이렇게 설정한 변수에대해서 get,set 메서드는 정의 안 해도 클래스객체 생성할때 마음대로 사용가능