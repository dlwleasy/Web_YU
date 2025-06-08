package jobstack.jobstack;

import jobstack.jobstack.Answer.Answer;
import jobstack.jobstack.Answer.AnswerRepository;
import jobstack.jobstack.Question.Question;
import jobstack.jobstack.Question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class TestDataRunner implements CommandLineRunner {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    @Override
    public void run(String... args) {
        // 1번 질문 저장
        Question q1 = new Question();
        q1.setSubject(" 무엇인가요?");
        q1.setContent(" 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        // 2번 질문 저장
        Question q2 = new Question();
        q2.setSubject("스프링 부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

        Answer a1 = new Answer();
        a1.setContent("네, 자동으로 생성됩니다.");
        a1.setCreateDate(LocalDateTime.now());
        a1.setQuestion(q2); // 어떤 질문에 대한 답변인지 연결
        this.answerRepository.save(a1);
    }}

