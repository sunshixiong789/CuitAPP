package cn.edu.cuit.cuitapp.util;

import cn.edu.cuit.cuitapp.common.CommonException;
import cn.edu.cuit.cuitapp.common.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *处理控制层异常
 * @author sunshixiong
 * @date 2018/2/2 10:13
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResult handle(Exception e){
        if(e instanceof CommonException){
            CommonException exception = (CommonException) e;
            return ResultUtil.error(exception.getCode(),exception.getMessage());
        }
        return ResultUtil.error(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage());
    }
}
