package com.yunjing.emer.service.serviceImpl;

import com.yunjing.emer.dao.QuestionnaireDao;
import com.yunjing.emer.entity.Questionnaire;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.service.QuestionnaireService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wzs
 * @date: 2020/5/6-10:11
 */

@Service

public class QusetionnaireServiceImp implements QuestionnaireService {

    @Resource
    QuestionnaireDao dao;

    @Override
    public List<Questionnaire> selectAllShow(String user, int page, int number,User users) {
        return dao.selectAllShow(user,page,number,users);
    }



    @Override
    public boolean deleteByQId(Integer questionnaireID) {
        return false;
    }

    @Override
    public int countQusetionnaireList(String user,User users) {

        return dao.countQusetionnaireList(user,users);
    }

    @Override
    public int insert(Questionnaire record) {
       /* String[] provinces = record.getProvince().split("_");
        String[] cities = record.getCitie().split("_");
        String[] country = record.getArea().split("_");
        record.setProvince(provinces[3]);
        record.setCitie(cities[3]);
        record.setArea(country[1]);*/

        return dao.insert(record);
    }

    @Override
    public boolean insert_xi(Questionnaire record) {
        int flag = dao.insert(record);
        if(flag>0){
            return true;
        }
        return false;
    }

    //更新模块
    @Override
    public int updateByPrimaryKeySelective(Questionnaire record, Integer questionnaireID) {

        /*String[] provinces = record.getProvince().split("_");
        String[] cities = record.getCitie().split("_");
        String[] country = record.getArea().split("_");
        record.setProvince(provinces[3]);
        record.setCitie(cities[3]);
        record.setArea(country[1]);
        record.setQuestionnaireid(questionnaireID);*/


        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean deleteQuestionnaire(int[] questionnaireid) {

        int flag = dao.deleteQuestionnaire(questionnaireid);
        if(flag>0) {
            return true;
        }
        return false;
    }


}
