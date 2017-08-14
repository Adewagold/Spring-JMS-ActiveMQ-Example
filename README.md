# Spring-JMS-ActiveMQ-Example

------------------------------------------------------------------------------------------------------------------------------------------

<h1>Please follow following steps to check the application:</h1>

1. Firstly download ActiveMQ Message Broker and install it.
2. Goto bin directory and start it using $ ./activemq start or find appropriate command for your OS.
3. You can quickly check your queues are empty by typing following URL to browser: 
   http://localhost:8161/admin/queues.jsp   (usename: admin, password: admin)
4. Download or clone both SpringJMS_ActiveMQ_Consumer and SpringJMS_ActiveMQ_Producer projects from git repository
5. Run SpringJMS_ActiveMQ_Producer and goto URL; http://localhost:8161/admin/queues.jsp and you can see two queues being created.
6. Now run SpringJMS_ActiveMQ_Consumer and again goto URL; http://localhost:8161/admin/queues.jsp and check the enque, deque list.

Thank you.
