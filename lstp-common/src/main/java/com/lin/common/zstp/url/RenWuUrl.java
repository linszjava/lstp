package com.lin.common.zstp.url;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/10 02:25
 */
@Getter
@AllArgsConstructor
public enum RenWuUrl {

    RENWU_ZONGLAN("RENWU_ZONGLAN","人物总览","/api/people"),

    AN_CHAODAI_LIULAN("AN_CHAODAI_LIULAN","按朝代浏览","https://{{host}}/api/people/{{dynasty}}"),

    HUOQU_TEDING_RENWU_JIEZHAO("HUOQU_TEDING_RENWU_JIEZHAO","获取特定人物介绍","https://{{host}}/api/people/{{id}}"),

    PEOPLE_MENTIONSHIP("PEOPLE_MENTIONSHIP","获取作品中互相提及的人物信息","https://{{host}}/api/people/{{id}}/mentionship"),



    ;

    private final String msg_pinyin;

    private final String msg_zh;

    private final String url;
}
