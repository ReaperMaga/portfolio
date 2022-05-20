import '../styles/global.css'

import ProgressBar from "@badrap/bar-of-progress";
import Router from "next/router";
import Head from "next/head";

const progress = new ProgressBar({
  size: 2,
  color: "#7c3aed",
  className: "bar-of-progress",
  delay: 100,
});

Router.events.on("routeChangeStart", progress.start);
Router.events.on("routeChangeComplete", progress.finish);
Router.events.on("routeChangeError", progress.finish);

function MyApp({ Component, pageProps }) {
  return  (
      <>
        <Head>
          <title>{"Maga's"} Portfolio</title>
            <link rel="shortcut icon" href="/favicon.ico" />
        </Head>
        <Component {...pageProps} />
      </>
  )
}

export default MyApp
