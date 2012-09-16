启动tomcat7(重新加载新的tomcat到target目录下,并启动)：
t7:run

先对代码编译打包,再自动部署到tomcat上(项目名为ROOT)：
package cargo:redeploy	

mybatis生成代码：
org.mybatis.generator:mybatis-generator-maven-plugin:1.3.1:generate


设置tomcat默认访问项目

修改port为80 ： 

<Connector 
port="80"                maxHttpHeaderSize="8192" 
                maxThreads="150" minSpareThreads="25" maxSpareThreads="75" 
                enableLookups="false" redirectPort="8443" acceptCount="100" 
                connectionTimeout="20000" disableUploadTimeout="true" /> 

找到如下片段： 

<Host name="localhost" appBase="webapps" 
        unpackWARs="true" autoDeploy="true" 
        xmlValidation="false" xmlNamespaceAware="false"> 

加上<Context path="" docBase="ajax" debug="0" reloadable="true"/>
即OK,dosBase里写的是要设置为默认项目的名。