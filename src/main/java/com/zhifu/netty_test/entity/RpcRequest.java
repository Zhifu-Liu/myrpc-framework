package com.zhifu.netty_test.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class RpcRequest {
    private String interfaceName;
    private String methodName;
}
