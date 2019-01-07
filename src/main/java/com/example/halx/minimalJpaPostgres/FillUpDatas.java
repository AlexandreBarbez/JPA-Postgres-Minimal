package com.example.halx.minimalJpaPostgres;

import com.example.halx.minimalJpaPostgres.model.Answer;
import com.example.halx.minimalJpaPostgres.model.Question;
import com.example.halx.minimalJpaPostgres.repository.AnswerRepository;
import com.example.halx.minimalJpaPostgres.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FillUpDatas {

    @Autowired
    private  QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @EventListener(ApplicationReadyEvent.class)
    private void createDatas() {

        System.out.println("Inserting datas onto Questions... ");

        Question question1 = new Question();
        question1.setTitle("Titre question 1");
        question1.setDescription("Description question 1");

        Question question2 = new Question();
        question2.setTitle("Titre question 2");
        question2.setDescription("Description question 2");

        questionRepository.save(question1);
        questionRepository.save(question2);
        System.out.println("... datas inserted");

        System.out.println("Inserting datas onto Answers... ");
        Answer answer1 = new Answer();
        answer1.setQuestion(question1);
        answer1.setText("answer 1 text");

        Answer answer2 = new Answer();
        answer2.setQuestion(question2);
        answer2.setText("answer 2 text");

        answerRepository.save(answer1);
        answerRepository.save(answer2);
        System.out.println("... datas inserted");
    }

}
