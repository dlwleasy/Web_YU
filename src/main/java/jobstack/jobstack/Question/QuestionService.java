package jobstack.jobstack.Question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import jobstack.jobstack.DataNotFoundException;


@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
//서비스에서 repository 접근 후
    public List<Question> getList() {
        return this.questionRepository.findAll();
    }

    //조회하기 위한 서비스 추가
    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");//없을때 예외처리하기
        }
    }

    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }
}
