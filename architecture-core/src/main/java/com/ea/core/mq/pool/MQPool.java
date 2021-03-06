/**
 * Copyright 2014 伊永飞
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ea.core.mq.pool;

import javax.jms.Connection;
import javax.jms.JMSException;

public interface MQPool {
	public void setMaxTotal(int maxTotal);
	
	public void setMaxIdle(int maxIdle);
	
	public void setMaxWaitMillis(int maxWaitMillis);
	
	public void addMQPool(String url, String username, String password);
	
	public Connection createConnection() throws JMSException;
	
	public void close(Connection conn) throws JMSException;
	
	public void stop() throws JMSException;
	
}
