organization := "org.hammerlab.bdg-utils"
name := "cli"
version := "0.2.16"

deps ++= Seq(
  args4j,
  args4s % "1.2.4",
  bdg_utils_metrics,
  bdg_utils_misc,
  paths % "1.2.0",
  parquet_avro
)

providedDeps ++= Seq(
  hadoop,
  spark
)
