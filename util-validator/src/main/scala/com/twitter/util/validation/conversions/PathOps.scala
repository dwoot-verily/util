package com.twitter.util.validation.conversions

import jakarta.validation.Path
import scala.jdk.CollectionConverters._

object PathOps {

  implicit class RichPath(val self: Path) extends AnyVal {
    def getLeafNode: Path.Node = {
      val nodes = self.iterator().asScala.toSeq
      if (nodes.nonEmpty) nodes.last else null
    }
  }
}
