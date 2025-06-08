package jobstack.jobstack.Question;


import jakarta.validation.Valid;
import jobstack.jobstack.Answer.AnswerForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;


import java.util.List;

@RequiredArgsConstructor
@Controller

@RequestMapping("/question")
public class QuestionController {

    //private final QuestionRepository questionRepository;
    private final QuestionService questionService;//서비스에서 객체만들기,정보전달할려고

    @GetMapping("/list")
    public String list(Model model) {
        //List<Question> questionList = this.questionRepository.findAll();
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList",questionList);
        return "question_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("answerForm", new AnswerForm());
        model.addAttribute("question", question);
        return "question_detail";
    }

    @GetMapping("/create")
    public String questionCreate(QuestionForm questionForm) {
        return "question_form";
    }

    @PostMapping("/create")
    public String questionCreate(@Valid QuestionForm questionForm, BindingResult
            bindingResult) {
        if (bindingResult.hasErrors()) {
            return "question_form";
        }
        this.questionService.create(questionForm.getSubject(), questionForm. getContent());
        return "redirect:/question/list";
    }
}

