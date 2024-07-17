package studyLettuceRedisJavaProject;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

public class ApplicationMain {

	public static void main(String[] args) {
		RedisClient redisClient = RedisClient.create("redis://localhost:6379");
		StatefulRedisConnection<String, String> connection = redisClient.connect();	
		RedisCommands<String, String> syncCommands = connection.sync();
		syncCommands.set("Test", "HiRedis");
		System.out.println(syncCommands.get("Test"));
		syncCommands.set("Test", "ByeRedis");
		System.out.println(syncCommands.get("Test1"));
	}
}
