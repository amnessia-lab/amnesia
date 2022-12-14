---
layout: default
title: amnesialab
---

<div id="main">

  <h1>Integrations</h1>

  <div id="content">

    <h2>Unfiltered</h2>

    <p>
      Grab amnesialab-unfiltered by adding the following dependency to sbt:
    </p>
    <pre>"io.amnesialab" %% "amnesialab-unfiltered" % "{{ site.release }}"</pre>

    <p>
      Use <code>JsonRequest</code> to wrap the <code>HttpRequest</code>. This
      produces an API equivelant to <code>ParseWrap</code>/<code>StringWrap</code>
      in core amnesialab.
    </p>

    <p>
      Use <code>JsonResponse</code> to wrap any data type than can be
      encoded (i.e. defines an instance for <code>EncodeJson</code>).
      JsonResponse will set the correct <code>content-type</code>, encode
      and print the json for your data.
    </p>

    <p>
      A complete example.
    </p>

    <pre class="prettyprint lang-scala linenums">
import amnesialab._, amnesialab._
import amnesialab.integrate.unfiltered._
import unfiltered.request._
import unfiltered.response._

class App extends unfiltered.filter.Plan {

  case class Data(value: String)

  implicit def DataCodecJson: CodecJson[Data] =
    casecodec1(Data.apply, Data.unapply)("data")

  def intent = {
    case req@ Get("/echo") =>
      JsonRequest(req).decodeOption[Data] match {
        case None => BadRequest
        case Some(data) => Ok ~> JsonResponse(data)
      }
    }
  }
</pre>

    <script type="text/javascript">
      prettyPrint();
    </script>

  </div>
</div>
