package io.github.kimmking.gateway.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @Description TODO
 * @Author Will
 * @Date 2022/3/20 9:07 PM
 */
public class MyFilter implements HttpResponseFilter{
    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("name","will");
    }
}
