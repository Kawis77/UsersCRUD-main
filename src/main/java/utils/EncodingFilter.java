package utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class EncodingFilter implements Filter {

    private String charsetEncoding = "utf-8";
    private String contentType = "text/html";
    public void destroy() {
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        request.setCharacterEncoding(charsetEncoding);
        response.setContentType(contentType);
        response.setCharacterEncoding(charsetEncoding);
        filterChain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
