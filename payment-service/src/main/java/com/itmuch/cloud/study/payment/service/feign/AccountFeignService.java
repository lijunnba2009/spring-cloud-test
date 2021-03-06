package com.itmuch.cloud.study.payment.service.feign;

import com.itmuch.cloud.study.common.base.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${feign.remote.account-service}",path = "/rest/account")
public interface AccountFeignService {

    @RequestMapping(value = "/getBalanceByUserId",method = RequestMethod.GET)
    Result<Long> getBalanceByUserId(@RequestParam(value = "userId") Long userId);

    @RequestMapping(value = "/updateBalanceByUserId",method = RequestMethod.GET)
    Result<Boolean> updateBalanceByUserId(@RequestParam(value = "userId") Long userId,@RequestParam(value = "amount")Long amount);
}
