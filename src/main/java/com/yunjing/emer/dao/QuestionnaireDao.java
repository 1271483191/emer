package com.yunjing.emer.dao;


import com.yunjing.emer.entity.Questionnaire;
import com.yunjing.emer.entity.QuestionnaireExample;
import com.yunjing.emer.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionnaireDao {
    long countByExample(QuestionnaireExample example);

    int deleteByExample(QuestionnaireExample example);

    int deleteByPrimaryKey(Integer questionnaireid);

    /*插入数据*/
    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    List<Questionnaire> selectByExample(QuestionnaireExample example);

    Questionnaire selectByPrimaryKey(Integer questionnaireid);

    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);

    /*分页查询*/
    List <Questionnaire> selectAllShow(@Param("user") String user, @Param("pages")Integer page
            , @Param("number")Integer number,@Param("users") User users);

    int countQusetionnaireList(@Param("user")String user,@Param("users") User users);

}