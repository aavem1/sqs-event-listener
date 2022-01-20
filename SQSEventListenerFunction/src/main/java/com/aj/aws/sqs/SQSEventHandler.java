package com.aj.aws.sqs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

public class SQSEventHandler implements RequestHandler<SQSEvent, Void> {
  @Override
  public Void handleRequest(SQSEvent event, Context context) {

    for (SQSMessage msg : event.getRecords()) {
      System.out.println(msg.getBody());
    }
    return null;
  }
}
