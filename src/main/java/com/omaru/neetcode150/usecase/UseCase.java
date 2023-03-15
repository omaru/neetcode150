package com.omaru.neetcode150.usecase;

public interface UseCase<Request, Response> {
    Response execute(Request request);
}
