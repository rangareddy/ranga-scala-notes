import com.ranga.config.Configuration
import org.apache.spark.SparkContext

object HelloWorldScala {
  def main(args: Array[String]): Unit = {
    val config: Configuration = new Configuration()
    println(config.getProperties)
  }
}