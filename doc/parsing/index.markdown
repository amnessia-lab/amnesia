---
layout: default
title: amnesialab
---

<div id="main">

  <script type="text/javascript">
    examples([
    'ParseExample',
    'DecodeExample'
    ]);
  </script>

  <h1>Json Parsing</h1>

  <div id="content">

    <h2>Parsing</h2>

    <p>
      There is a full suite of parsing and decoding operations. Each operation
      can be called directly via <code>Parse</code> or via a syntax implicit on <code>Strings</code>.
      The parse operations are also designed to be cleanly added as syntax to third-party
      libraries in a consistent form (see <a href="/doc/integration">amnesialab-unfiltered</a>
      for an example.
    </p>


    The parse operations convert an input into a <code>Json</code> data type with
    various error-handling mechanims.

    <pre class="prettyprint lang-scala linenums" id="example_ParseExample">
    </pre>

    <h2>Parsing and Decoding</h2>

    The decode operations convert an input into a <code>Json</code> data type, and
    then attempt to decode the json using a <code>Codec</code> with various error-handling mechanims.

    <pre class="prettyprint lang-scala linenums" id="example_DecodeExample">
    </pre>

  </div>
</div>
