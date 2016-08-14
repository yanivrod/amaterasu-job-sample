val oddRdd = AmaContext.getRDD[Int]("start", "rdd").filter(x=>x/2 == 0)
oddRdd.saveAsTextFile(s"${env.outputRootPath}/test/ordd_rdd")

val highNoDf = AmaContext.getDataFrame("start", "x").where("_1 > 3")
highNoDf.write.json(s"${env.outputRootPath}/dtatframe_res")
