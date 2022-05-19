import {observer} from "mobx-react-lite";
import dynamic from "next/dynamic";

const AboutMeNoSsr = dynamic(
    () => import('../components/about/AboutMe'),
    { ssr: false }
)


const Page = observer(() => {
    return <AboutMeNoSsr />
})

export default Page
