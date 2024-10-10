package com.lin.common.zstp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>TODO</p>
 *
 * @author linsz
 * @version v1.0
 * @date 2024/10/9 17:31
 */
@Getter
@AllArgsConstructor
public enum ZstpUrl {

    GUJI("https://api.cnkgraph.com"),

    SHIWEN("https://open.cnkgraph.com");

    private final String URL;
}
