package top.tangyh.lamp.oauth.api.hystrix;

import top.tangyh.lamp.oauth.api.LogApi;
import top.tangyh.basic.base.R;
import top.tangyh.basic.log.entity.OptLogDTO;
import org.springframework.stereotype.Component;

/**
 * 日志操作 熔断
 *
 * @author zuihou
 * @date 2019/07/02
 */
@Component
public class LogApiHystrix implements LogApi {
    @Override
    public R<OptLogDTO> save(OptLogDTO log) {
        return R.timeout();
    }
}
