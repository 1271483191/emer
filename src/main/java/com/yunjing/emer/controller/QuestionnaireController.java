package com.yunjing.emer.controller;

import com.yunjing.emer.entity.Questionnaire;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.service.serviceImpl.QusetionnaireServiceImp;
import com.yunjing.emer.util.LayuiUtil;
import com.yunjing.emer.util.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: wzs
 * @date: 2020/5/6-09:55
 */

@Controller
public class QuestionnaireController {

    @Resource
    QusetionnaireServiceImp qusetionnaireService;


    @RequestMapping("/toQuestionnaire")
    public String toQuestionnaire(){

        return "questionnaire_list";

    }

    /*展示农民调查问卷的数据*/
    @RequestMapping("/toquestionnaireList")
    @ResponseBody
    public LayuiUtil<Questionnaire> toquestionnaireList(int page, int limit, Questionnaire questionnaire,
    HttpServletRequest request){

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        LayuiUtil<Questionnaire> result = new LayuiUtil<>();
        int pages=1;
        page=(page-1)*limit;
        List<Questionnaire> li = qusetionnaireService.selectAllShow(questionnaire.getUser(),page,limit,user);

        /*QuestionnaireExample example = new QuestionnaireExample();
        QuestionnaireExample.Criteria criteria = example.createCriteria();
        criteria.andUserEqualTo(questionnaire.getUser());
        pages = qusetionnaireService.countByExample(example);
        */
        pages = qusetionnaireService.countQusetionnaireList(questionnaire.getUser(),user);
        result.setData(li);
        result.setCount(pages);

        return result;
    }

    /*跳转到添加和修改界面*/
    @RequestMapping("/toAddQuestionnaire")
    public String toAddQuestionnaire(){
        return "add_Questionnaire";
    }



    /*更改调查问卷*/
    @RequestMapping(value="/toupdataQuestionnaire",method=RequestMethod.POST)
    @ResponseBody
    public  Message updataQuestionnaire(Questionnaire questionnaire, HttpServletRequest request){

        Message message = new Message();
        HttpSession session = request.getSession();
        session.setAttribute("questionnaireid",questionnaire.getQuestionnaireid());
        return message;
    }




    /*添加问卷数据*/
    @RequestMapping(value="/toaddquestionnaire",method= RequestMethod.POST)
    @ResponseBody
    public Message addquestionnaire(@RequestBody Questionnaire questionnaire, HttpServletRequest request){
        String name = request.getParameter("age");
        System.out.print(name);
        Message message = new Message();
        HttpSession session = request.getSession();
        if(session.getAttribute("questionnaireid")!=null){
            //更新
            int questionnaireid =(int)session.getAttribute("questionnaireid");

            session.removeAttribute("questionnaireid");
        }else {
            //添加操作
            int flag = qusetionnaireService.insert(questionnaire);
            if(flag>=0) {
                message.setCode(200);
                message.setMsg("添加成功");
                message.setRes(true);
            }else {
                message.setCode(404);
                message.setMsg("添加失败,发生未知错误请重试！");
                message.setRes(false);
            }

        }
        //session.removeAttribute("questionnaireid");

        return message;
    }


}
