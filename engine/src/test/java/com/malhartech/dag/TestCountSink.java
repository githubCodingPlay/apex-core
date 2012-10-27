/**
 * Copyright (c) 2012-2012 Malhar, Inc.
 * All rights reserved.
 */
package com.malhartech.dag;

import com.malhartech.api.Sink;
import java.util.ArrayList;
import java.util.List;

/**
 * A sink implementation to collect expected test results.
 */
public class TestCountSink<T> extends TestSink<T>
{
  public  int count = 0;



  /**
   *
   * @param payload
   */
  @Override
  public void process(T payload)
  {
    if (payload instanceof Tuple) {
    }
    else {
      count++;
    }
  }
}