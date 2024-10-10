package com.lin.common.zstp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/9 17:50
 */
@Getter
@AllArgsConstructor
public enum ZstpType {

    RENWU("RENWU","人物"),
    GUJIKU("GUJIKU","古籍库"),
    DILI("DILI","地理"),
    ZIDIAN("ZIDIAN","字典"),
    GONGJU("GONGJU","工具"),
    NIANLI("NIANLI","年历"),
    QUPU("QUPU","曲谱"),
    LEISHU("LEISHU","类书"),
    CIHUI_DIANGU("CIHUI_DIANGU","词汇、典故"),
    CIPU("CIPU","词谱"),
    SHIWENKU("SHIWENKU","诗文库"),
    YUNDIAN("YUNDIAN","韵典");

    /** 类型 **/
    private final String type;

    /** 中文表示 **/
    private final String cn_zh;


}
