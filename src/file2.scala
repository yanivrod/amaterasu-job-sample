val oddRdd = AmaContext.getRDD[Int]("start", "rdd").filter(x=>x%2 == 0).map(x=>x*1)
oddRdd.saveAsTextFile(s"${env.outputRootPath}/test/ordd_rdd")

val highNoDf = AmaContext.getDataFrame("start", "odd").where("number > 100")
highNoDf.write.mode(SaveMode.Overwrite).json(s"${env.outputRootPath}/dtatframe_res")
