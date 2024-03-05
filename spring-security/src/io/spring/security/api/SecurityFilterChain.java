package io.spring.security.api;

import io.spring.security.config.*;
import io.spring.security.util.*;

public class SecurityFilterChain {
    Interceptor interceptor;
    PostAuth postAuth;
    MethodSecurity methodSecurity;
    WebSecurityConfig webSecurityConfig;
}
