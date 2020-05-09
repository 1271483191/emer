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
        System.out.println(questionnaire.getUser());
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
    @RequestMapping(value="/updataQuestionnaire",method=RequestMethod.POST)
    @ResponseBody
    public  Message updataQuestionnaire(@RequestBody Questionnaire questionnaire){

        //1_user_王志生 11,1_province_安徽省,1_citie_安庆市,1_area_枞阳县
        //1_user_王志生
        /*String[] info = information.split(",");
        String id = info[0].split("_")[0];

        for (String i: info) {
            String[] news = i.split("_");
            if(id.equals(news[0])){
            }
        }*/
        Message message = new Message();
        int questionnaireid = questionnaire.getQuestionnaireid();

        int flag = qusetionnaireService.updateByPrimaryKeySelective(questionnaire,questionnaireid);

        if(flag>0) {
            message.setMsg("修改成功");
            message.setCode(200);
            message.setRes(true);
        }else {
            message.setMsg("发生未知错误！请重新输入！");
            message.setCode(404);
            message.setRes(false);
        }

        return message;


    }


    /*@RequestMapping(value="/addtoQuestionnaire",method=RequestMethod.POST)
    @ResponseBody
    public  Message addtoQuestionnaire(String tag, HttpServletRequest request){
        //System.out.print(tag+"-----------------------------------");
        Message message = new Message();
        HttpSession session = request.getSession();
        session.setAttribute("tag",tag);
        return message;
    }*/

    /*添加问卷数据*/
    @RequestMapping(value="/addquestionnaire",method= RequestMethod.POST)
    @ResponseBody
    public Message addquestionnaire(@RequestBody Questionnaire questionnaire){

        Message message = new Message();
            //添加操作
            int flag = qusetionnaireService.insert(questionnaire);
            if(flag>0) {
                message.setCode(200);
                message.setMsg("添加成功");
                message.setRes(true);
            }else {
                message.setCode(404);
                message.setMsg("添加失败,发生未知错误请重试！");
                message.setRes(false);
            }

        /*else if(session.getAttribute("tag")==null && session.getAttribute("questionnaireid") !=null)
        {
            //更新
            int questionnaireid =(int)session.getAttribute("questionnaireid");
            int flag = qusetionnaireService.updateByPrimaryKeySelective(questionnaire,questionnaireid);

            if(flag>0) {
                message.setMsg("修改成功");
                message.setCode(200);
                message.setRes(true);
            }else {
                message.setMsg("发生未知错误！请重新输入！");
                message.setCode(404);
                message.setRes(false);
            }
            session.removeAttribute("questionnaireid");
        }*else {
            message.setMsg("发生未知错误！请重新输入！");
            message.setCode(404);
            message.setRes(false);
            session.removeAttribute("questionnaireid");
            session.removeAttribute("tag");
        }*/

        return message;
    }

    /*微信接口添加*/
    @RequestMapping(value="/addquestionnaireweixing",method= RequestMethod.POST)
    @ResponseBody
    public Message addquestionnaire1(@RequestBody Questionnaire questionnaire, HttpServletRequest request){

        Message message = new Message();
        HttpSession session = request.getSession();

        boolean flag = qusetionnaireService.insert_xi(questionnaire);
        if(flag) {
            message.setCode(200);
            message.setMsg("添加成功");
            message.setRes(true);
        }else {
            message.setCode(404);
            message.setMsg("添加失败,发生未知错误请重试！");
            message.setRes(false);
        }
        return message;
    }

    /*删除*/
    @RequestMapping(value="/deletequestionnaire",method= RequestMethod.POST)
    @ResponseBody
    public Message deletequestionnaire(String newsId){

        Message message = new Message();
        String[] idArray = newsId.split(",");
        int[] questionnaireid = new int[idArray.length];
        for(int i=0;i<=idArray.length-1;i++) {
            questionnaireid[i] = Integer.parseInt(idArray[i]);
        }
        boolean flag = qusetionnaireService.deleteQuestionnaire(questionnaireid);
        if(flag) {
            message.setMsg("删除成功！");
            message.setCode(200);
            message.setRes(true);
        }
        return message;
    }


}
