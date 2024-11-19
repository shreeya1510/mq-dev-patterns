/*
* (c) Copyright IBM Corporation 2020, 2024
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.ibm.mq.samples.jms.quarkus;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class AMQPTestConfig {

    @ConfigProperty(name = "amqp-mqtest.queuename")
    private Optional<String> queuename;

    @ConfigProperty(name = "amqp-mqtest.topicname")
    private Optional<String> topicname;

    @ConfigProperty(name = "amqp-mqtest.replyqueuename")
    private Optional<String> replyqueuename;

    private List<String> appargs;

    public Optional<String> getQueueName() { return queuename; }
    public void setQueuename(Optional<String> queuename) { this.queuename = queuename; }

    public Optional<String> getTopicName() { return topicname; }
    public void setTopicname(Optional<String> topicname) { this.topicname = topicname; }

    public Optional<String> getReplyQueueName() { return replyqueuename; }
    public void setReplyqueuename(Optional<String> mode) { this.replyqueuename = replyqueuename; }

    public List<String> getAppArgs() { return appargs; }
    public void setAppargs(List<String> appargs ) { this.appargs = appargs; }

}
