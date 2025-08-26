package tech.powerjob.common.request.http;

import lombok.Data;
import lombok.experimental.Accessors;
import tech.powerjob.common.PowerSerializable;
import tech.powerjob.common.model.JobInstanceRuntimeConfig;

/**
 * 运行任务
 *
 * @author tjq
 * @since 2025/8/16
 */
@Data
@Accessors(chain = true)
public class RunJobRequest implements PowerSerializable {

    private Long jobId;
    /**
     * 运行时参数
     */
    private String instanceParams;
    /**
     * 延迟执行的时间，单位毫秒
     */
    private Long delay;

    /**
     * “外键”，用于 OPENAPI 场景业务场景与 PowerJob 实例的绑定
     */
    private String outerKey;
    /**
     * 扩展属性，用于 OPENAPI 场景上下文参数的透传
     */
    private String extendValue;

    /**
     * 运行时参数，覆盖 Job 的一些配置（如指定机器执行）
     */
    private JobInstanceRuntimeConfig runtimeConfig;

    /* 无需填写，系统自动填充 */
    private Long appId;
}
