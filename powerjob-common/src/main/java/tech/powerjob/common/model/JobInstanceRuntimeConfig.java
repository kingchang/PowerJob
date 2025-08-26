package tech.powerjob.common.model;

import lombok.Data;
import tech.powerjob.common.PowerSerializable;

/**
 * 任务实例运行时参数
 *
 * @author tjq
 * @since 2025/8/16
 */
@Data
public class JobInstanceRuntimeConfig implements PowerSerializable {

    /**
     * 指定机器执行的配置
     */
    private String designatedWorkers;
}
