package com.netflix.zuul.service;

import com.netflix.zuul.util.*;
import io.spring.security.api.*;

public class ApiGateway {
    Utility utility;
    Viz viz;
    TCPConfig tcpConfig;
    Decoder decoder;
    SecurityFilterChain securityFilterChain;
}
