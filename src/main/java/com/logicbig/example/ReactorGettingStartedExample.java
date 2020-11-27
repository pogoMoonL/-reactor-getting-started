package com.logicbig.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactorGettingStartedExample {
    public static void main(String[] args) {
        System.out.println("-- Mono example --");
        Mono<String> mono = Mono.just("test mono");
        mono.subscribe(System.out::println);

        System.out.println("-- Flux example --");

        Flux.just(1, 2, 3)
                .subscribe(System.out::println);
    }
}