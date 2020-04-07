# Java API Example for reading & writing files into HDFS

### Step1: Download the Project
Goto any specific folder and download the project using git clone. \
`git clone https://github.com/rangareddy/hdfs-java-api.git`

### Step2: Build the Project
`mvn clean package`

### Step3: Run the Project
`java -jar target/hdfs-java-api-1.0-SNAPSHOT.jar hdfs://localhost:8020`

### Step4: Verify the output
2020-03-31 15:29:55 INFO  HDFSClient:59 - Configuration object built successfully with the params {fs.defaultFS=hdfs://localhost:8020} \
2020-03-31 15:29:55 WARN  NativeCodeLoader:60 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable \
2020-03-31 15:29:56 INFO  HDFSJavaAPIDemo:33 - Creating a hdfs dir /ranga/hdfs/data/ \
2020-03-31 15:29:56 INFO  HDFSClient:53 - HDFS directory </ranga/hdfs/data> created successfully. \
2020-03-31 15:29:56 INFO  HDFSJavaAPIDemo:36 - Creating a file /ranga/hdfs/data/README.md in hdfs. \
2020-03-31 15:29:57 INFO  HDFSClient:36 - HDFS directory </ranga/hdfs/data/README.md> deleted successfully. \
2020-03-31 15:29:59 INFO  HDFSFileWriter:78 - Data is successfully written to hdfsPath </ranga/hdfs/data/README.md> \
2020-03-31 15:29:59 INFO  HDFSJavaAPIDemo:45 - File </ranga/hdfs/data/README.md> created successfully \
2020-03-31 15:29:59 INFO  HDFSJavaAPIDemo:47 - Reading data from hdfs file </ranga/hdfs/data/README.md> \
2020-03-31 15:30:00 INFO  HDFSJavaAPIDemo:49 - File content \
Hadoop Components: 
 ---------------------------------------------------
 1. HDFS - Hadoop Distributed File System
 2. MR - MAPREDUCE
 3. YARN - Yet Another Resource Negotiator

2020-03-31 15:30:00 INFO  HDFSJavaAPIDemo:51 - Renaming a file \
2020-03-31 15:30:00 INFO  HDFSClient:67 - HDFS File /ranga/hdfs/data/README.md is successfully renamed to /ranga/hdfs/data/README_1.md \
2020-03-31 15:30:00 INFO  HDFSJavaAPIDemo:54 - Listing file(s) under </ranga/hdfs/data/> directory. \
2020-03-31 15:30:00 INFO  HDFSJavaAPIDemo:58 - hdfs://localhost:8020/ranga/hdfs/data/README_1.md \
2020-03-31 15:30:00 INFO  HDFSJavaAPIDemo:61 - Deleting a hdfs dir </ranga/hdfs/data/> \
2020-03-31 15:30:01 INFO  HDFSClient:36 - HDFS directory </ranga/hdfs/data> deleted successfully. \

## Note
If u want to use this code in production remove the following two lines from ConfigUtils.java file <br/>
`System.setProperty("hadoop.home.dir", "/");
System.setProperty("HADOOP_USER_NAME", "hdfs");`