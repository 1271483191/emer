package com.yunjing.emer.service;

import com.yunjing.emer.entity.Questionnaire;
import com.yunjing.emer.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: wzs
 * @date: 2020/5/6-09:59
 */

public interface QuestionnaireService {
    /*查询调查问卷的所有信息*/
    public List<Questionnaire> selectAllShow(String user, int page, int number, User users);

    /*删除调查问卷的信息*/
    public boolean deleteByQId(Integer questionnaireID);

    /*根据条件统计数据*/
    public int countQusetionnaireList(String user,User users );

    /*添加数据*/
    public int insert(Questionnaire record);

    /*微信端添加接口*/
    public boolean insert_xi(Questionnaire record);

    /*更据id值更新*/
    int updateByPrimaryKeySelective(Questionnaire record,Integer questionnaireID);

    /*删除和批量删除*/
    boolean deleteQuestionnaire(int[] questionnaireid);

    /*Excel导出*/
    List <Questionnaire> SelectQuestionnaireExcel(String usernews,@Param("users") User users);
}
