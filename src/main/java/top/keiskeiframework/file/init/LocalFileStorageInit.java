package top.keiskeiframework.file.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import top.keiskeiframework.file.config.FileLocalProperties;
import top.keiskeiframework.file.util.MultiFileUtils;

/**
 * <p>
 * 初始化文件目录
 * </p>
 *
 * @author 陈加敏 right_way@foxmail.com
 * @since 2019/11/3 0:17
 */
@Component
public class LocalFileStorageInit implements CommandLineRunner {

    @Autowired
    private FileLocalProperties fileLocalProperties;

    @Override
    public void run(String... args) throws Exception {
        MultiFileUtils.checkDir(fileLocalProperties.getPath());
        MultiFileUtils.checkDir(fileLocalProperties.getTempPath());
    }
}
