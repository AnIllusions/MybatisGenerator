package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class CreatCode {
	
	public static void main(String[] args) throws Exception {
	    List<String> warnings = new ArrayList<String>();
	    boolean overwrite = true;
	    //ָ文件 路径
	    File configFile = new File("D:\\Idea_workspace\\MybatisGenerator\\src\\config2.xml");
	    System.out.println(configFile.exists());
	    ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = cp.parseConfiguration(configFile);
	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
	            callback, warnings);
	    myBatisGenerator.generate(null);
	}

}
