organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.2.14"

deps ++= Seq(
  libs.value('args4j),
  libs.value('args4s),
  libs.value('bdg_utils_metrics),
  libs.value('bdg_utils_misc),
  libs.value('paths),
  libs.value('parquet_avro)
)

providedDeps ++= Seq(
  libs.value('hadoop),
  libs.value('spark)
)
