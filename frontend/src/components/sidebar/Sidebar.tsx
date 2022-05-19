import SidebarItem from "./SidebarItem";
import {RiHomeLine} from "react-icons/ri";
import {BiMessageAlt, BiUser} from "react-icons/bi";

const Sidebar = () => {
    return (
        <div className="flex flex-col justify-center items-center space-y-12 w-20 h-full bg-zinc-900">
            <SidebarItem name="Home" url="/" icon={<RiHomeLine />} />
            <SidebarItem name="About" url="/about" icon={<BiUser />} />
            <SidebarItem name="Contact" url="/contact" icon={<BiMessageAlt />} />
        </div>
    )
}

export default Sidebar
