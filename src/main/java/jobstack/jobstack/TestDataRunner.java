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
        q1.setSubject("상담사 방문후기");
        q1.setContent("상담사님이 1시간 넘게 친절하게 상담해주셔서 진로 방향성을 찾고 그에대해서 취업설게도 같이 해보았습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        // 2번 질문 저장
        Question q2 = new Question();
        q2.setSubject("삼성전자 관련 질문입니다.");
        q2.setContent("혹시 토익 스피킹과 토익 몇점 받아야하나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

        Answer a1 = new Answer();
        a1.setContent("직무조사페이지에서 직접 찾아보기를 권장드립니다.");
        a1.setCreateDate(LocalDateTime.now());
        a1.setQuestion(q2); // 어떤 질문에 대한 답변인지 연결
        this.answerRepository.save(a1);
    }}

