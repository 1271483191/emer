package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Questionnaire;
import com.yunjing.emer.entity.QuestionnaireExample;
import java.util.List;

import com.yunjing.emer.entity.User;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireDao {
    long countByExample(QuestionnaireExample example);

    int deleteByExample(QuestionnaireExample example);

    int deleteByPrimaryKey(Integer questionnaireid);

    /*插入数据*/
    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    List<Questionnaire> selectByExampleWithBLOBs(QuestionnaireExample example);

    List<Questionnaire> selectByExample(QuestionnaireExample example);

    Questionnaire selectByPrimaryKey(Integer questionnaireid);

    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExampleWithBLOBs(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByPrimaryKeyWithBLOBs(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);

    /*分页查询*/
    List <Questionnaire> selectAllShow(@Param("usernews") String user, @Param("pages")Integer page
            , @Param("number")Integer number,@Param("users") User users);
    //根据条件统计数量
    int countQusetionnaireList(@Param("usernews")String user,@Param("users") User users);

    /*更新*/
    int updateByPrimaryKeySelective(Questionnaire record);
    /*删除和批量删除*/
    int deleteQuestionnaire(int[] questionnaireid);

    /*Excel导出*/
    List <Questionnaire> SelectQuestionnaireExcel(@Param("usernews")String usernews,@Param("users") User users);

}
