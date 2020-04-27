package com.yunjing.emer.controller;

import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.service.CompanyInfoService;
import com.yunjing.emer.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class InputController {

    @Autowired
    private CompanyInfoService companyInfoService;

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping("/toSupplyInput")
    public String toSupplyInput(){
        return "supply_input";
    }

    @RequestMapping("/toDeliverInput")
    public String toDeliverInput(){
        return "delivery_input";
    }

    @RequestMapping("/toStoreageInput")
    public String toStoreageInput(){
        return "storeage_input";
    }

    @RequestMapping("/toMachiningInput")
    public String toMachiningInput(){
        return "machine_input";
    }

    @RequestMapping("/toInsertDelivery")
    @ResponseBody
    public boolean toInsertDelivery(CompanyInfo companyInfo, Delivery delivery){
        boolean result = false;
        Date date = new Date();
        System.out.println(date);
        companyInfo.setTime(date);

        System.out.println(companyInfo);
        System.out.println(delivery);

        List<CompanyInfo> companyInfos = companyInfoService.selectBySocialId(companyInfo.getSocialId());
        boolean c = false;
        boolean d = false;
        if(companyInfos.size() == 0){
            c = companyInfoService.insertCompanyInfo(companyInfo);
            List<CompanyInfo> companyInfoList = companyInfoService.selectAll2();
            int companyId = companyInfoList.get(companyInfoList.size() - 1).getCompanyId();
            delivery.setCompanyId(companyId);
            d = deliveryService.insertDelivery(delivery);
        }else{
            companyInfo.setCompanyId(companyInfos.get(0).getCompanyId());
            c = companyInfoService.updateCompanyInfo(companyInfo);
            delivery.setCompanyId(companyInfos.get(0).getCompanyId());
            d = deliveryService.updateByCId(delivery);
        }

        if(c&&d){
            result = true;
            System.out.println("插入成功");
        }

        return result;
    }
}
