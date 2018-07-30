//package com.run.zuul;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//
//@Component
//public class MyFilter extends ZuulFilter{
//
//    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
//    @Override
//    public String filterType() {
//    	// 4种取值: 
//    	// pre：可以在请求被路由之前调用
//    	// routing:路由之时
//    	// post: 路由之后
//    	// error: 发送错误调用
//    	// 实现身份验证、在集群中选择请求的微服务、记录调试信息等
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//    	// 优先级为0，数字越大，优先级越低
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
////      // 判断上一个过滤器结果为true，否则就不走下面过滤器，直接跳过后面的所有过滤器并返回 上一个过滤器不通过的结果。
////    	RequestContext ctx = RequestContext.getCurrentContext();
////        return (boolean) ctx.get("isSuccess");
//
//        // 这里可以写逻辑判断，是否要过滤
//        return true;
//    }
//
//    /**
//     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
//     */
//    @Override
//    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
//        Object accessToken = request.getParameter("token");
//        if(accessToken == null) {
//            log.warn("token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            try {
//                ctx.getResponse().getWriter().write("token is empty");
//            }catch (Exception e){}
//
//            return null;
//        }
//        
////        ctx.set("isSuccess", true);
//        log.info("ok");
//        return null;
//    }
//}
