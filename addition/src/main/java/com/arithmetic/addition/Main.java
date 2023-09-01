package com.arithmetic.addition;

import java.io.IOException;

import io.helidon.microprofile.server.Server;

public final class Main {

	public static void main( final String[] args)throws IOException {
		// TODO Auto-generated method stub
		Server server = startServer();
        System.out.println("http://localhost:" + server.port() + "/greet");
	}
	static Server startServer() {
        return Server.create().start(); 
    }


}
